(ns ogbe.fulcro.mui.icons.fax
  #?(:cljs (:require
            ["@mui/icons-material/Fax" :default Fax]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fax
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fax)))