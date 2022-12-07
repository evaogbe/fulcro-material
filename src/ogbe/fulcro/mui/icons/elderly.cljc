(ns ogbe.fulcro.mui.icons.elderly
  #?(:cljs (:require
            ["@mui/icons-material/Elderly" :default Elderly]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-elderly
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Elderly)))