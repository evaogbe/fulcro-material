(ns ogbe.fulcro.mui.icons.escalator
  #?(:cljs (:require
            ["@mui/icons-material/Escalator" :default Escalator]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-escalator
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Escalator)))