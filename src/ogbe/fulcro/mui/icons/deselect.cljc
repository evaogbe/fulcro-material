(ns ogbe.fulcro.mui.icons.deselect
  #?(:cljs (:require
            ["@mui/icons-material/Deselect" :default Deselect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deselect
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Deselect)))