(ns ogbe.fulcro.mui.icons.local-cafe
  #?(:cljs (:require
            ["@mui/icons-material/LocalCafe" :default LocalCafe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-cafe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalCafe)))