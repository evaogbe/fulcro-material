(ns ogbe.fulcro.mui.icons.microwave
  #?(:cljs (:require
            ["@mui/icons-material/Microwave" :default Microwave]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-microwave
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Microwave)))