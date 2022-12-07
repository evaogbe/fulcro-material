(ns ogbe.fulcro.mui.icons.looks
  #?(:cljs (:require
            ["@mui/icons-material/Looks" :default Looks]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-looks
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Looks)))