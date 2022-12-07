(ns ogbe.fulcro.mui.icons.euro-symbol
  #?(:cljs (:require
            ["@mui/icons-material/EuroSymbol" :default EuroSymbol]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-euro-symbol
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EuroSymbol)))