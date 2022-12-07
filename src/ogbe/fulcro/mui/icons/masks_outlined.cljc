(ns ogbe.fulcro.mui.icons.masks-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MasksOutlined" :default MasksOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-masks-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MasksOutlined)))