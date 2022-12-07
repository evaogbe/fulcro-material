(ns ogbe.fulcro.mui.icons.drafts-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DraftsRounded" :default DraftsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drafts-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DraftsRounded)))