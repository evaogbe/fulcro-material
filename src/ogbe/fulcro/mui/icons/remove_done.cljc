(ns ogbe.fulcro.mui.icons.remove-done
  #?(:cljs (:require
            ["@mui/icons-material/RemoveDone" :default RemoveDone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-done
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveDone)))