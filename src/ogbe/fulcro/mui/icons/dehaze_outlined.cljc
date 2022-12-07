(ns ogbe.fulcro.mui.icons.dehaze-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DehazeOutlined" :default DehazeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dehaze-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DehazeOutlined)))