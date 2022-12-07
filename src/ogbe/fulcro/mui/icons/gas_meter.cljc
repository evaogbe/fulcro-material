(ns ogbe.fulcro.mui.icons.gas-meter
  #?(:cljs (:require
            ["@mui/icons-material/GasMeter" :default GasMeter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gas-meter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GasMeter)))