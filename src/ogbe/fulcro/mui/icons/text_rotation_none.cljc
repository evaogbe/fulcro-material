(ns ogbe.fulcro.mui.icons.text-rotation-none
  #?(:cljs (:require
            ["@mui/icons-material/TextRotationNone" :default TextRotationNone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-rotation-none
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextRotationNone)))