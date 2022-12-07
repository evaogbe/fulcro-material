(ns ogbe.fulcro.mui.icons.tab
  #?(:cljs (:require
            ["@mui/icons-material/Tab" :default Tab]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tab)))