(ns ogbe.fulcro.mui.icons.wash
  #?(:cljs (:require
            ["@mui/icons-material/Wash" :default Wash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wash)))