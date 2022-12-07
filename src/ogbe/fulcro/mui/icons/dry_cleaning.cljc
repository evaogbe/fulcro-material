(ns ogbe.fulcro.mui.icons.dry-cleaning
  #?(:cljs (:require
            ["@mui/icons-material/DryCleaning" :default DryCleaning]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dry-cleaning
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DryCleaning)))