(ns ogbe.fulcro.mui.icons.gas-meter-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GasMeterSharp" :default GasMeterSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gas-meter-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GasMeterSharp)))