(ns ogbe.fulcro.mui.icons.toys
  #?(:cljs (:require
            ["@mui/icons-material/Toys" :default Toys]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toys
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Toys)))