(ns ogbe.fulcro.mui.icons.vaccines
  #?(:cljs (:require
            ["@mui/icons-material/Vaccines" :default Vaccines]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vaccines
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Vaccines)))