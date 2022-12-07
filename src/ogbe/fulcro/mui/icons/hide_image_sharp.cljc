(ns ogbe.fulcro.mui.icons.hide-image-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HideImageSharp" :default HideImageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hide-image-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HideImageSharp)))