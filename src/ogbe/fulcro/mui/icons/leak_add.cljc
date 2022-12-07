(ns ogbe.fulcro.mui.icons.leak-add
  #?(:cljs (:require
            ["@mui/icons-material/LeakAdd" :default LeakAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leak-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeakAdd)))