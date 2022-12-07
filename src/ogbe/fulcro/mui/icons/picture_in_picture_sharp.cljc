(ns ogbe.fulcro.mui.icons.picture-in-picture-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PictureInPictureSharp" :default PictureInPictureSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-picture-in-picture-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PictureInPictureSharp)))