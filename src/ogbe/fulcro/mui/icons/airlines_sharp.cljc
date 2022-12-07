(ns ogbe.fulcro.mui.icons.airlines-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AirlinesSharp" :default AirlinesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airlines-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirlinesSharp)))