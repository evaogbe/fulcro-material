(ns ogbe.fulcro.mui.icons.tty
  #?(:cljs (:require
            ["@mui/icons-material/Tty" :default Tty]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tty
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tty)))