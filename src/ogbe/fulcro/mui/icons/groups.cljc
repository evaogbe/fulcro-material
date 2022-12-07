(ns ogbe.fulcro.mui.icons.groups
  #?(:cljs (:require
            ["@mui/icons-material/Groups" :default Groups]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-groups
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Groups)))