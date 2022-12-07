(ns ogbe.fulcro.mui.icons.markunread
  #?(:cljs (:require
            ["@mui/icons-material/Markunread" :default Markunread]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-markunread
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Markunread)))