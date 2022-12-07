(ns ogbe.fulcro.mui.icons.key
  #?(:cljs (:require
            ["@mui/icons-material/Key" :default Key]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-key
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Key)))