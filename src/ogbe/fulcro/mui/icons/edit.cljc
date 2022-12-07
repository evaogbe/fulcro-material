(ns ogbe.fulcro.mui.icons.edit
  #?(:cljs (:require
            ["@mui/icons-material/Edit" :default Edit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Edit)))