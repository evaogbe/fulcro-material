(ns ogbe.fulcro.mui.icons.dvr-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DvrRounded" :default DvrRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dvr-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DvrRounded)))