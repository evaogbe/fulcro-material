(ns ogbe.fulcro.mui.icons.hd
  #?(:cljs (:require
            ["@mui/icons-material/Hd" :default Hd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hd
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hd)))