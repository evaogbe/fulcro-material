(ns ogbe.fulcro.mui.icons.sd
  #?(:cljs (:require
            ["@mui/icons-material/Sd" :default Sd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sd)))