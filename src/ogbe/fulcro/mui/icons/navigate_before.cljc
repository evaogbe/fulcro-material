(ns ogbe.fulcro.mui.icons.navigate-before
  #?(:cljs (:require
            ["@mui/icons-material/NavigateBefore" :default NavigateBefore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigate-before
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NavigateBefore)))