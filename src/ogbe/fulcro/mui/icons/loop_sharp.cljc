(ns ogbe.fulcro.mui.icons.loop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LoopSharp" :default LoopSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoopSharp)))