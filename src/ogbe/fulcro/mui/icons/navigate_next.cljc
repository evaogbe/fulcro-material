(ns ogbe.fulcro.mui.icons.navigate-next
  #?(:cljs (:require
            ["@mui/icons-material/NavigateNext" :default NavigateNext]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigate-next
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NavigateNext)))