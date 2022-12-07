(ns ogbe.fulcro.mui.icons.three-drotation
  #?(:cljs (:require
            ["@mui/icons-material/ThreeDRotation" :default ThreeDRotation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-drotation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeDRotation)))