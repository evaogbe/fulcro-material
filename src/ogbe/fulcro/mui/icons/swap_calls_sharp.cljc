(ns ogbe.fulcro.mui.icons.swap-calls-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwapCallsSharp" :default SwapCallsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swap-calls-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwapCallsSharp)))