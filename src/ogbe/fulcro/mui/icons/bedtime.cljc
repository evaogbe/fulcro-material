(ns ogbe.fulcro.mui.icons.bedtime
  #?(:cljs (:require
            ["@mui/icons-material/Bedtime" :default Bedtime]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bedtime
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bedtime)))