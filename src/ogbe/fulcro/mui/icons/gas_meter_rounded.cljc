(ns ogbe.fulcro.mui.icons.gas-meter-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GasMeterRounded" :default GasMeterRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gas-meter-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GasMeterRounded)))