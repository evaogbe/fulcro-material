(ns ogbe.fulcro.mui.icons.gas-meter-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GasMeterOutlined" :default GasMeterOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gas-meter-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GasMeterOutlined)))