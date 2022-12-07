(ns ogbe.fulcro.mui.icons.swap-calls
  #?(:cljs (:require
            ["@mui/icons-material/SwapCalls" :default SwapCalls]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swap-calls
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwapCalls)))