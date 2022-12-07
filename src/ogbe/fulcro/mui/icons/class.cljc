(ns ogbe.fulcro.mui.icons.class
  #?(:cljs (:require
            ["@mui/icons-material/Class" :default Class]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-class
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Class)))