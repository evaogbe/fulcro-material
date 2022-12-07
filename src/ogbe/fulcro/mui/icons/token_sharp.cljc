(ns ogbe.fulcro.mui.icons.token-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TokenSharp" :default TokenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-token-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TokenSharp)))