(ns ogbe.fulcro.mui.icons.share-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShareRounded" :default ShareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareRounded)))