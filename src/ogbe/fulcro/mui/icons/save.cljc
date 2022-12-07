(ns ogbe.fulcro.mui.icons.save
  #?(:cljs (:require
            ["@mui/icons-material/Save" :default Save]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Save)))