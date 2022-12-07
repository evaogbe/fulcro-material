(ns ogbe.fulcro.mui.icons.computer-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ComputerSharp" :default ComputerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-computer-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ComputerSharp)))