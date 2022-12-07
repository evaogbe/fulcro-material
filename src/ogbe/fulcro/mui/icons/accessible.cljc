(ns ogbe.fulcro.mui.icons.accessible
  #?(:cljs (:require
            ["@mui/icons-material/Accessible" :default Accessible]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Accessible)))