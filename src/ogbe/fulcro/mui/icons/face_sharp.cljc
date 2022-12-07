(ns ogbe.fulcro.mui.icons.face-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FaceSharp" :default FaceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-face-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FaceSharp)))