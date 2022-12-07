(ns ogbe.fulcro.mui.icons.face-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FaceRounded" :default FaceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-face-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FaceRounded)))