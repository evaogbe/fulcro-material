(ns ogbe.fulcro.mui.icons.maximize
  #?(:cljs (:require
            ["@mui/icons-material/Maximize" :default Maximize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maximize
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Maximize)))