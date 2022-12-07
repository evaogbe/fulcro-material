(ns ogbe.fulcro.mui.icons.hide-image-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HideImageRounded" :default HideImageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hide-image-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HideImageRounded)))