(ns ogbe.fulcro.mui.icons.cabin
  #?(:cljs (:require
            ["@mui/icons-material/Cabin" :default Cabin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cabin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cabin)))