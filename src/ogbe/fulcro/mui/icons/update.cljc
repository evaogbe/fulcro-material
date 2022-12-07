(ns ogbe.fulcro.mui.icons.update
  #?(:cljs (:require
            ["@mui/icons-material/Update" :default Update]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-update
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Update)))