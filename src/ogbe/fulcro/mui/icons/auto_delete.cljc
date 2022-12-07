(ns ogbe.fulcro.mui.icons.auto-delete
  #?(:cljs (:require
            ["@mui/icons-material/AutoDelete" :default AutoDelete]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-delete
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoDelete)))