(ns ogbe.fulcro.mui.icons.splitscreen
  #?(:cljs (:require
            ["@mui/icons-material/Splitscreen" :default Splitscreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-splitscreen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Splitscreen)))